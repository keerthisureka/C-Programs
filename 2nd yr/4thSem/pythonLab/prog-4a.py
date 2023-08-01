import random

# insertion sort
def insertion_sort(arr1):
    for i in range(len(arr1)):
        key = arr1[i]
        j = i - 1
        while j >= 0 and key < arr1[j]:
            arr1[j+1] = arr1[j]
            j -= 1
        arr1[j+1] = key
    return arr1

# merge sort
def merge_sort(arr2):
    if len(arr2) > 1:
        mid = len(arr2) // 2
        left = arr2[:mid]
        right = arr2[mid:]
        merge_sort(left)
        merge_sort(right)

        i = j = k = 0
        while i < len(left) and j < len(right):
            if left[i] <= right[j]:
                arr2[k] = left[i]
                i += 1
            else:
                arr2[k] = right[j]
                j += 1
            k += 1

        while i < len(left):
            arr2[k] = left[i]
            i += 1
            k +=1
        while j < len(right):
            arr2[k] = right[j]
            j += 1
            k += 1
    return arr2


n = int(input("Enter the number of elements: "))
arr = []
for i in range(n):
    arr.append(random.randint(0, 999))
print("Initial array: ", arr)
print("After insertion sort: ", insertion_sort(arr))
print("After merge sort: ", merge_sort(arr))