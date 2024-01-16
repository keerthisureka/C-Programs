# Input for the size of lists
n = int(input())
m = int(input())

# Input for the elements of lists
# list1 = list(map(int, input().split()))
# list2 = list(map(int, input().split()))
list1 = []
list2 = []
for i in range(n):
    list1.append(int(input()))
for i in range(m):
    list2.append(int(input()))

res = list()

# Extract odd-index elements from list1
odd_elements = list1[1::2]

# Extract even-index elements from list2
even_elements = list2[0::2]

# Combine the odd and even elements into the third list
res = odd_elements + even_elements

# Print the final third list in square brackets
print('[' + ', '.join(map(str, res)) + ']')
