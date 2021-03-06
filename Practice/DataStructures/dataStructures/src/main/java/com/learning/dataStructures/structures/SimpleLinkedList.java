package com.learning.dataStructures.structures;

public class SimpleLinkedList <T> implements Cloneable{
	private Node<T> head;
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
		if (isEmpty())
			return null;
		
		return head.getElement();
	}
	
	public T last()
	{
		if (isEmpty())
			return null;
		
		return tail.getElement();
	}
	
	public void addFirst(T element)
	{
		head = new Node<>(element, head);
		
		if(size == 0)
		{
			tail = head;
		}
		
		size++;
	}
	
	public void addLast(T element)
	{
		Node<T> node = new Node<>(element);
		
		if(!isEmpty())
		{
			tail.setNext(node);
		}
		else
		{
			head = node;
		}
		
		tail = node;
		size++;
	}
	
	public T removeFirst()
	{
		if(isEmpty())
		{
			return null;
		} else
		{
			head = head.next;
		}
		
		size--;
		
		if (size == 0)
		{
			tail = null;
		}
		
		return head == null ? null : head.getElement();
	}
	
	@Override
	public boolean equals(Object o)
	{
		if(o == null)
		{
			return false;
		}
		
		if(!getClass().equals(o.getClass()))
		{
			return false;
		}
		SimpleLinkedList other = (SimpleLinkedList) o;
		Node walkA = head;
		Node walkB = other.head;
		
		while(walkA != null)
		{
			if(walkB == null || !walkA.getElement().equals(walkB.getElement()))
			{
				return false;
			}
			
			walkA = walkA.getNext();
			walkB = walkB.getNext();
		}
		
		return true;
	}
	
	@Override
	public SimpleLinkedList<T> clone() throws CloneNotSupportedException
	{
		SimpleLinkedList<T> other = (SimpleLinkedList<T>) super.clone();
		
		if(size > 0)
		{
			other.head = new Node<>(head.getElement(), null);
			Node<T> walkA = head.getNext();
			Node<T> otherTrail = other.head;
			
			while(walkA != null)
			{
				Node<T> newest = new Node<>(walkA.getElement(), null);
				otherTrail.setNext(newest);
				otherTrail = newest;
				walkA = walkA.getNext();
			}
			
			other.tail = otherTrail;
		}
		
		return other;
	}
}
