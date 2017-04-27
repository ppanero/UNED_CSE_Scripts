# Finns Noise reduction algorithm

This is a naive implementation of Finn´s algorithm for noise reduction in HTML files taken from the paper [Content Classification for Digital Libraries](http://citeseerx.ist.psu.edu/viewdoc/download;jsessionid=52AC8EDBA2188255ECD7430F7DE7B286?doi=10.1.1.21.3834&rep=rep1&type=pdf)

It parses line by line assigning 0 to a vector where there is a word and 1 if its a tag. At the end it shows the graph of the overall evloution, in general we can observe flat areas where high amount of text is concentrated.