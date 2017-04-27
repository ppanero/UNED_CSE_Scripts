import urllib2
import matplotlib.pyplot as plt

content = urllib2.urlopen(URL).read()
lines = content.split('\n')
last_count = 0
tokens = []
for line in lines:
	words = line.split(" ")
	tag = True
	for word in words:
		if not tag:
			if "<" in word:
				last_count += 1
				tokens.append(last_count)
			else:
				tokens.append(last_count)
		else:
			if ">" in word:
				tag = False


plt.plot(tokens)
plt.ylabel('count')
plt.xlabel('tokens')
plt.show()