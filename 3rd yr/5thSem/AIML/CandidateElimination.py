import pandas as pd

def is_consistent(h, example):
    for i in range(len(h)):
        if h[i] != '?' and h[i] != example[i]:
            return False
    return True

def generalize_minimize(h, example, is_positive):
    for i in range(len(h)):
        if is_positive:
            if h[i] == '?' and example[i] != '?':
                h[i] = example[i]
            elif h[i] != '?' and example[i] == '?':
                h[i] = '?'
        else:
            if h[i] != '?' and h[i] != example[i]:
                h[i] = '?'
    return h

def specialize_minimize(h, example):
    specialized_hypotheses = [list(h)]
    
    for i in range(len(h)):
        if h[i] == '?':
            for val in ['0', '1']:
                specialized_hypothesis = list(h)
                specialized_hypothesis[i] = val
                specialized_hypotheses.append(specialized_hypothesis)

    return specialized_hypotheses

def candidate_elimination(training_data):
    data = pd.read_csv(training_data)
    attributes = data.iloc[:, :-1].values
    target = data.iloc[:, -1].values

    specific_h = attributes[0].copy()
    general_h = [['?' for _ in range(len(specific_h))] for _ in range(len(specific_h))]

    for i in range(len(attributes)):
        if target[i] == '1':
            specific_h = generalize_minimize(specific_h, attributes[i], True)
            general_h = [h for h in general_h if is_consistent(h, attributes[i])]
            general_h = [h for new_h in general_h for h in specialize_minimize(new_h, attributes[i])]
        else:
            general_h = [h for h in general_h if not is_consistent(h, attributes[i])]
            specific_hypotheses = specialize_minimize(specific_h, attributes[i])
            general_h = general_h + specific_hypotheses

    return specific_h, general_h

if __name__ == "__main__":
    training_data_file = "your_training_data.csv"  # Provide the path to your CSV file
    specific_hypothesis, general_hypotheses = candidate_elimination(training_data_file)

    print("Specific Hypothesis:")
    print(specific_hypothesis)
    print("\nGeneral Hypotheses:")
    for h in general_hypotheses:
        print(h)

""" The Candidate-Elimination algorithm is used for concept learning in machine learning. Here's a Python program 
that implements the Candidate-Elimination algorithm for a given set of training data examples stored in a .CSV file: 
python. Make sure to replace "your_training_data.csv" with the actual path to your training data CSV file. The 
program reads the training data, applies the Candidate-Elimination algorithm, and outputs the specific and general hypotheses. """
