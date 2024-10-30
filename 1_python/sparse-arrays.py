# https://www.hackerrank.com/challenges/sparse-arrays/problem?isFullScreen=true
def matchingStrings(stringList, queries):
    # Write your code here
    # Loop through the elements of queries
    # Check the array list for exact match
    data = {
        queries[0]: 0,
        queries[1]: 0,
        queries[2]: 0
    }
    
    print(stringList, queries)
    for query in queries:
        print(query)
        if query == stringList[0]:
            queries[0] = +1
        if query == stringList[1]:
            queries[1] = +1
        if query == stringList[2]:
            queries[2] = +1
        if query == stringList[3]:
            queries[0] = +1
            
    print(data)
