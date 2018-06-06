package com.syswin.guava.collect;

import junit.framework.TestCase;

import com.google.common.base.Objects;
import com.google.common.base.Splitter;
import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;

public class MultisetTest extends TestCase{

	/**
	 * Multiset看似是一个Set，但是实质上它不是一个Set，它没有继承Set接口，
	 * 它继承的是Collection<E>接口，你可以向Multiset中添加重复的元素，
	 * Multiset会对添加的元素做一个计数。
	 * 
	 * 它本质上是一个Set加一个元素计数器。
	 */
	
	public void test(){
		Multiset<String> multiset = HashMultiset.create();
        String sentences = "this is a story, there is a good girl in the story.";
        Iterable<String> words = Splitter.onPattern("[^a-z]{1,}").omitEmptyStrings().trimResults().split(sentences);
        for (String word : words) {
            multiset.add(word);
        }
        
        multiset.setCount("there", 4);

        for (Object element : multiset.elementSet()) {
            System.out.println((String)element + ":" + multiset.count(element));
        }
	}
	
	public void test2(){
		Multiset<String> multiset1 = HashMultiset.create();
		multiset1.add("a");
		multiset1.add("b");
		multiset1.add("a");
		Multiset<String> multiset2 = HashMultiset.create();
		multiset2.add("b");
		multiset2.add("a");
		multiset2.add("a");
		boolean flag = Objects.equal(multiset1, multiset2);
		System.out.println(flag);
	}
}
