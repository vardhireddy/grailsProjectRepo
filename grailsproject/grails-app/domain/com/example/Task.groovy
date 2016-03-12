package com.example

class Task {
	String name
	String details
	static hasMany = [tags:Tag]
	
	static mapping = {
		cache true
		cache usage:'read-write'
	 }
	
    static constraints = {
		name blank:false, nullable:false
		details blank:false,nullable:false
    }
}
