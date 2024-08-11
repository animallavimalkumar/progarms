def analyze_file(file_path):
    with open(file_path,'r')as file:
        content=file.read()
        word_count=len(content.split())
        vowel_count=sum(1 for char in content if char.lower() in 'aeiou')
        space_count=content.count(' ')
        lowercase_count=sum(1 for char in content if char .lower())
        uppercase_count=sum(1 for char in content if char .upper())
        print("Number of words:%s"%word_count)
        print("Number of words:%s"%vowel_count)
        print("Number of words:%s"%space_count)
        print("Number of words:%s"%lowercase_count)
        print("Number of words:%s"%uppercase_count)
file_path='vin.txt'
analyze_file(file_path)