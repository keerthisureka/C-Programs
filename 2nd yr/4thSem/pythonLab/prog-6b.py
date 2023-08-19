import os
from zipfile import ZipFile

foldername = input("Enter the folder name: ") # folder name whose zipfile is to be created
myzip = foldername + ".zip" # zipfile name

with ZipFile(myzip, 'w') as zipobj:
    folderlen = len(foldername)
    for folder, subfolders, files in os.walk(foldername):
        for file in files:
            file_path = os.path.join(folder, file)
            zipobj.write(file_path, file_path[folderlen:])

if os.path.exists(myzip):
    print("%s zip file created" %myzip)
else:
    print("%s zip file not created" %myzip)

# Write a python program to create a ZIP file of a particular folder which contains several files inside it.
