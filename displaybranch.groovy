def getbranches = "git ls-remote -h -t https://github.com/DevopsAmol503/ycard.git".execute()
def branches = []
def b1 = []
getbranches.text.eachLine {branches.add(it)}
for(i in branches)
b1.add(i.split()[1].replaceAll('\\^\\{\\}', '').replaceAll('refs/tags/', '').replaceAll('refs/heads/', ''))
b1 = b1.unique()
print b1
