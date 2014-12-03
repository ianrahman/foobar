def answer(x):
	x=list(set(x))
	distinct = len(x)
	for k, l in enumerate(x):
		if l != "".join(reversed(l)):
			check = "".join(reversed(l))
			if check in x:
				distinct = distinct - 1
				x.remove(check)
				x.remove(l)
				
	return distinct


print answer(["oooooooooo","oooooooooo"])
print answer(["foo","bar"])
print answer(["foo", "bar", "oof"])
print answer(["x", "y", "xy", "yyy", "", "yx"])
