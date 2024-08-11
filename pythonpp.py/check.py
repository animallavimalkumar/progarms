def check_words(file_path,words):
    with open(file_path,'r')as file:
        content =file.read()
        for word in words:
            if word in content:
                print("Found:%s"%word)
            else:
                print("Not found:%s"%word)
file_path='vin1.txt'
words=['apple','banana','orange']
check_words(file_path,words)