class Queue:
	def __init__(self):
		self.queue = []
	def isFull(self):
		return self.queue == []
	def enQueue(self, data):
		self.queue.append(data)
	def deQueue(self):
		if(not self.isFull()):
			self.queue.pop(0)
		return
	def peekFront(self):
		print(self.queue[-1])
	def peekBack(self):
		print(self.queue[0])
	def showQueue(self):
		print(self.queue)
