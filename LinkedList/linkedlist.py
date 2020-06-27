class Node(object):
	def __init__(self,data):
		self.next = None
		self.data = data

class LinkedList(object):
	def __init__(self):
		self.head = None

	def print_list(self):
		current_node = self.head
		while current_node:
			print(current_node.data)
			current_node = current_node.next

	def insert_back(self,x):
		new_node = Node(x)
		if self.head is None:
			self.head = new_node
			return
		last_node = self.head
		while last_node.next:
			last_node = last_node.next
		last_node.next = new_node

	def insert_front(self,x):
		new_node = Node(x)
		new_node.next = self.head
		self.head = new_node

	def insert_after(self,pos,x):
		new_node = Node(x)
		current_node = self.head
		counter = 0
		while pos != counter:
			current_node = current_node.next
			counter += 1
		new_node.next = current_node.next
		current_node.next = new_node

	def insert_before(self,pos,x):
		pos = pos-1
		self.insert_after(pos,x)





linkedlist = LinkedList()

linkedlist.insert_back(202)
linkedlist.insert_back(203)
linkedlist.insert_back(205)
linkedlist.insert_back(208)
linkedlist.insert_front(209)
linkedlist.insert_before(2,211)
linkedlist.print_list()






		