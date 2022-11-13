package org.example;

import redis.clients.jedis.Jedis;

import java.util.Map;

public class Main {
	public static void main (String[] args) {
		
		Jedis jedis = new Jedis("localhost", 6379);
		
		System.out.println("Connected to Redis");

//		jedis.set("manh", "dev");
//		String value = jedis.get("manh");
//
//		jedis.lpush("queue#tasks", "firstTask");
//		jedis.lpush("queue#tasks", "secondTask");
//
//		String task = jedis.rpop("queue#tasks");
//

//
//		jedis.sadd("nicknames", "nickname#1");
//		jedis.sadd("nicknames", "nickname#2");
//		jedis.sadd("nicknames", "nickname#1");
//
//		Set<String> nicknames = jedis.smembers("nicknames");
//		boolean exists = jedis.sismember("nicknames", "nickname#1");
//		System.out.println(nicknames);
		
//		jedis.hset("user#1", "name", "Peter");
//		jedis.hset("user#1", "job", "politician");
//
//		String name = jedis.hget("user#1", "name");
//
//		Map<String, String> fields = jedis.hgetAll("user#1");
//		String job = fields.get("job");
//
//		fields.forEach((s, s2) -> System.out.println(s + " : " + s2) );
	}
}