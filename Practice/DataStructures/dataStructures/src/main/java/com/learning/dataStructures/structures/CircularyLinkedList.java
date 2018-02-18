package com.learning.dataStructures.structures;

public class CircularyLinkedList<T> {
	private Node<T> tail;
	private long size;
	
	private static class Node<T>{
		private T element;
		private Node<T> next;
		
		public Node(T element)
		{
			this(element, null);
		}
		
		public Node(T element, Node<T> next)
		{
			this.element = element;
			this.next = next;
		}

		public T getElement() {
			return element;
		}

		public void setElement(T element) {
			this.element = element;
		}

		public Node<T> getNext() {
			return next;
		}

		public void setNext(Node<T> next) {
			this.next = next;
		}
		
	}
	
	public long size()
	{
		return size;
	}
	
	public boolean isEmpty()
	{
		return size == 0; 
	}
	
	public T first()
	{
		if(isEmpty())
		{
			return null;
		}
		
		return tail.getNext().getElement();
	}
	
	public T last()
	{
		if(isEmpty())
		{
			return null;
		}
		
		return tail.getElement();
	}
	
	public void addFirst(T element)
	{
		Node<T> node = new Node<>(element);
		
		if (isEmpty())
		{
			tail = node;
		}
		else
		{
			node.setNext(tail.getNext());
			tail.setNext(node);
		}
		
		size++;
	}
	
	public void addLast(T element)
	{
		addFirst(element);
		tail = tail.getNext();
	}
	
	public T removeFirst()
	{
		if(isEmpty())
		{
			return null;
		}
		
		T element = null;;
		
		if(tail.getNext() == null)
		{
			tail = null;
		}
		else
		{
			element = tail.getNext().getElement();
			tail.setNext(tail.getNext().getNext());
		}
		
		size--;
		
		return element;
	}
	
	public void rotate()
	{
		if(!isEmpty())
		{
			tail = tail.getNext();
		}
	}
}
