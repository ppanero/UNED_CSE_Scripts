# Spark Zipf's Law

This is a simple Spark program that allows to calculate Zipf's Law:

     The frequency of the rth most common word is inversely proportional to r or, alternatively,
     the rank of a word times its prequency (f) is approximately a constant (k).

The program has a hardcoded entry dataset, which is a simple post of a well-knwon spanish car forum. 

In the end the results proved Zipf's Law. We can see that (approximately) half of all the unique words in the sample 
occur only once. In the following table the number of words with a certain amount of occurrences is shown when no 
stopping is applied.

Amount of unique words: 536

| Number of occurrences | Number of words | 
|:---------------------:|:---------------:|
|1                      |395              | 
|2                      |66               |
|3                      |20               |
|4                      |14               |
|5                      |6                |
|6                      |5                |
|7                      |2                |
|8                      |7                |
|9                      |1                |
|10                     |2                |
|11                     |1                |
|12                     |1                |
|12                     |2                |
|14                     |2                |
|15                     |2                |
|18                     |1                |
|19                     |1                |
|20                     |1                |
|23                     |1                |
|24                     |1                |
|26                     |1                |
|36                     |1                |
|40                     |1                |
|48                     |1                |
|50                     |1                |

So as we can see the percentage of words that occur only once in the text is 73%, however if we use stopping that percentage goes down to 53%, being closer to Zipf's Law and therefore proving it.

The results of applying the script with stopping (spanish stop words taken from [here](https://github.com/6/stopwords-json)) can be seen in the following table:

Amount of unique words: 156

| Number of occurrences | Number of words | 
|:---------------------:|:---------------:|
|1                      |83               | --> Meaning 53% of the total 
|2                      |26               |
|3                      |12               |
|4                      |4                |
|5                      |3                |
|6                      |3                |
|7                      |1                |
|8                      |4                |
|9                      |1                |
|10                     |1                |
|11                     |1                |
|12                     |1                |
|12                     |2                |
|14                     |2                |
|15                     |2                |
|18                     |1                |
|19                     |1                |
|20                     |1                |
|23                     |1                |
|24                     |1                |
|26                     |1                |
|36                     |1                |
|40                     |1                |
|48                     |1                |
|50                     |1                |
