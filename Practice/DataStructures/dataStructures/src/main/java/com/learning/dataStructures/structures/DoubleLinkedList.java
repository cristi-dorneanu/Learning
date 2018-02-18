package com.learning.dataStructures.structures;

public class DoubleLinkedList<T> {

	private Node<T> header;
	private Node<T> trailer;
	private long size;
	
	private static class Node<T>{
		private T element;
		private Node<T> prev;
		private Node<T> next;
		
		public Node(T element, Node<T> prev, Node<T> next)
		{
			this.element = element;
			this.prev = prev;
			this.next = next;
		}

		public T getElement() {
			return element;
		}

		public void setElement(T element) {
			this.element = element;
		}

		public Node<T> getPrev() {
			return prev;
		}

		public void setPrev(Node<T> prev) {
			this.prev = prev;
		}

		public Node<T> getNext() {
			return next;
		}

		public void setNext(Node<T> next) {
			this.next = next;
		}
	}
	
	public DoubleLinkedList()
	{
		header = new Node<>(null, null, null);
		trailer = new Node<>(null, header, null);
		header.setNext(trailer);
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
		
		return header.getNext().getElement();
	}
	
	public T last()
	{
		if(isEmpty())
		{
			return null;
		}
		
		return trailer.getPrev().getElement();
	}
	
	public void addFirst(T element)
	{
		addBetween(element, header, header.getNext());
	}
	
	public void addLast(T element)
	{
		addBetween(element, trailer.getPrev(), trailer);
	}
	
	public T removeFirst()
	{
		if(isEmpty())
		{
			return null;
		}
		
		return remove(trailer.getNext());
	}
	
	public T removeLast()
	{
		if(isEmpty())
		{
			return null;
		}
		
		return remove(trailer.getPrev());
	}
	
	private void addBetween(T element, Node<T> prev, Node<T> next)
	{
		Node<T> node = new Node<>(element, prev, next);
		
		prev.setNext(node);
		next.setPrev(node);
		size++;
	}
	
	private T remove(Node<T> node)
	{
		Node<T> prev = node.getPrev();
		Node<T> next = node.getNext();
		
		prev.setNext(next);
		next.setPrev(prev);
		
		size--;
		
		return node.getElement();
	}
}
