from PyPDF2 import PdfWriter, PdfReader

num = int(input("Enter page number you want to combine from multiple documents: "))

pdf1 = open('Lab Manual-PPL.pdf', 'rb') # any pdf file name
pdf2 = open('PYTHON DICTIONARIES.pdf', 'rb') # another pdf file name

pdf_writer = PdfWriter()

pdf1_reader = PdfReader(pdf1)    
page = pdf1_reader.pages[num - 1]
pdf_writer.add_page(page)

pdf2_reader = PdfReader(pdf2)    
page = pdf2_reader.pages[num - 1]
pdf_writer.add_page(page)

with open('output.pdf', 'wb') as output: # merged pdf name will be "output" in this case
    pdf_writer.write(output)
    print("PDF pages merged!")

# Merge selected pages from Multiple PDFs to a new PDF. Write a python program to combine select pages from many PDFs.
