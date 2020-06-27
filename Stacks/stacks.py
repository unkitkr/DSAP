
class Stack(object):
	def __init__(self):
		self.stack = []
	def is_empty(self):
		return self.stack == []
	def push(self,x):
		self.stack.append(x)
	def pop(self):
		if not self.is_empty():
			self.stack.pop()
	def peek(self):
		print(self.stack[-1])
	def display(self):
		print(self.stack)






