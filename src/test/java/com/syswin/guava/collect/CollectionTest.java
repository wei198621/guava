package com.syswin.guava.collect;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import junit.framework.TestCase;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.ObjectArrays;
import com.google.common.collect.Sets;

public class CollectionTest extends TestCase{

	/**
	 * 集合的创建
	 */
	public void test1(){
		//jdk
		Map<String, Map<String, String>> map = new HashMap<String, Map<String,String>>();
		List<List<Map<String, String>>> list = new ArrayList<List<Map<String,String>>>();
		
		//guava
		Map<String, Map<String, String>> map_cp = Maps.newHashMap();
		List<List<Map<String, String>>> list_cp = Lists.newArrayList();
		Set<String> set = Sets.newHashSet();
		List<String> List= Lists.newLinkedList();
		Map<String,String> personMap= Maps.newHashMap();
		Integer[] intArrays= ObjectArrays.newArray(Integer.class,10);
	}
	
	/**
	 * 集合的初始化
	 */
	public void test2(){
		//jdk
		Set<String> set = new HashSet<String>();
		set.add("one");
		set.add("two");
		set.add("three");
		
		//guava
		Set<String> set_cp = Sets.newHashSet("one","two","three");
		List<String> list = Lists.newArrayList("one","two","three");
		Map<String, String> map = ImmutableMap.of("ON","TRUE","OFF","FALSE"); //不可变

	}

	//map(i)              HashMap
	//collection(i)       HashSet
	//                    ArrayList
	public void test3(){
//在平时开发中，程序员们使用最多了莫过于ArrayList、HashSet和HashMap了。在多数情况下，这三个实现类已经能够满足我们的大部分需求，
		Map<String,String> mapTest=new HashMap<String,String>();
		Set<String> setTest=new HashSet<String>();
		List<String> listTest=new ArrayList<String>();

		mapTest.put("key1","val1");
		mapTest.put("key2","val2");

		setTest.add("set1");
		setTest.add("set2");

		listTest.add("list1");
		listTest.add("list2");
	}

	public void test4(){
		ArrayList<Integer> loadsList = new ArrayList<Integer>();
		loadsList.add(1);
		loadsList.add(2);
		loadsList.add(0);
		loadsList.add(3);
		loadsList.add(2);
		loadsList.add(1);
		loadsList.add(3);
		loadsList.add(5);
		loadsList.add(0);

		HashSet<Integer> loadsSet = new HashSet<Integer>();
		loadsSet.add(1);
		loadsSet.add(2);
		loadsSet.add(0);
		loadsSet.add(3);
		loadsSet.add(2);
		loadsSet.add(1);
		loadsSet.add(3);
		loadsSet.add(5);
		loadsSet.add(0);

		System.out.println("the arrayList: " + loadsList);
		//the arrayList: [1, 2, 0, 3, 2, 1, 3, 5, 0]
		//List中的元素是按照add顺序加载的，并且里面有重复的元素，==》有序可重复
		//ArrayList是一组有序的集合，当对象被添加到ArrayList时，对象会先找到第一个空缺的地方，记住，放进去的是对象的引用，不是对象本身，接下来，第二个对象依次在第二个位置增加，如果发现有相同的对象，也是按照顺序放进去，也就是说，在这个有序集合里，每有一个对象就会放入一个引用，可能出现多个引用指向同一个对象的情况，但没有关系.

		System.out.println("the hashSet:   " + loadsSet);
		//the hashSet:   [0, 1, 2, 3, 5]
		//Set中的元素没有按照add顺序加载，并且里面没有重复的元素，==》无序不可重复
		//HashSet，当放入对象时，首先查看里面是否有这样一个对象，如果有，则不放，如果没有才会放入，如果真的很想放进去这个对象，除非将已经存在的对象删除、


	}



}
