def most_frequent_word(file_path):
    with open(file_path,'r') as file:
        content = file.read().lower().split()
        word_count={}
        for word in content:
            if word not in word_count:
                word_count[word]=1
            else:
                word_count[word]+=1
        most_common_word=max(word_count,key=word_count.get)
        return most_common_word
file_path='sample_file.txt'
most_common_word=most_frequent_word(file_path)
print("the mst occ%s"%most_common_word)