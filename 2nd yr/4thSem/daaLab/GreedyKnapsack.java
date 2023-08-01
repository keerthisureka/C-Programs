import java.util.Scanner;

public class GreedyKnapsack {
	int no_of_objects;
	float W;
	class item{
		int weight, value, index;
		float unit_value;
		void read_item(Scanner sc, int index) {
			System.out.println("Enter value and weight of the object: ");
			value = sc.nextInt();
			weight = sc.nextInt();
			this.index = index;
			unit_value = (float)value/weight;
		}
	}
	
	public item[] read_data() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of objects and sack capacity: ");
		no_of_objects = sc.nextInt();
		W = sc.nextFloat();
		System.out.println("Read object data: ");
		item objects[] = new item[no_of_objects];
		for(int i = 0; i<no_of_objects; i++) {
			objects[i] = new item();
			objects[i].read_item(sc,  i+1);
		}
		return objects;
	}
	
	public void sort(item objects[]) {
		int i, j;
		item temp;
		for(i = 0; i<no_of_objects; i++) {
			for(j = 0; j<no_of_objects-1; j++) {
				if(objects[j].unit_value<objects[j+1].unit_value) {
					temp = objects[j];
					objects[j] = objects[j+1];
					objects[j+1] = temp;
				}
			}
		}
		System.out.println("List of items in the order of unit value are: ");
		for(i = 0; i<no_of_objects; i++) {
			System.out.printf("Item %d\n Unit Value: %f\n", objects[i].index, objects[i].unit_value);
		}
	}
	
	public void find_value(item objects[]) {
		sort(objects);
		System.out.println("");
		float value = 0, w = 0, k = W, fraction_value;
		int ob;
		int i = 0;
		System.out.println("Objects\f\fWeights");
		while(k>0 && i<no_of_objects) {
			if(k>=objects[i].weight) {
				k = k-objects[i].weight;
				value = value+objects[i].value;
				w = w+objects[i].weight;
				System.out.printf("1 Unit of item %d taken with value %d \n", objects[i].index, objects[i].value);
			}
			else {
				fraction_value = k * objects[i].unit_value;
				value = value + fraction_value;
				w = w + k;
				System.out.printf("1 Unit of item %d taken with value %f \n", objects[i].index, fraction_value);
				k = 0;
			}
			i++;
		}
		System.out.printf("\nTotal value of item taken is %f\n", value);
		System.out.printf("Total weight of item taken is %f\n", w);
	}
	
	public static void main(String[] args) {
		GreedyKnapsack ks_obj = new GreedyKnapsack();
		item objects[];
		objects = ks_obj.read_data();
		ks_obj.find_value(objects);
	}
}
