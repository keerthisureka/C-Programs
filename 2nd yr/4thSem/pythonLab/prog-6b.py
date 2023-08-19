import os
from zipfile import ZipFile

foldername = input("Enter the folder name: ")
myzip = foldername + ".zip"

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