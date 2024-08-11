def merge_files(file1,file2,output_file):
    with open(file1,'r')as f1,open(file2,'r')as f2,open(output_file,'w')as output:
        content1=f1.read()
        content2=f2.read()
        output.write(content1)
        output.write(content2)
file1='file1.txt'
file2='file2.txt'
output_file='merged_file.txt'
merge_files(file1,file2,output_file)
