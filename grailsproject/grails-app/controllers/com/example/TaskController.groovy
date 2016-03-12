package com.example

class TaskController {
	static scaffold = Task
	
	def findOrSaveBy(){
		def b = Task.findOrSaveByNameAndDetails("call","Please call to customer...")
//		b = Task.findById(b.id)
		println "task name:"+b.name
	}
	def findOrCreateBy(){
		def task = Task.findOrCreateByNameAndDetails("Email","Please send an email...")
		println "find or create by method:-task name:"+task.name
	}
	def findOrSaveWhere(){
		def task = Task.findOrSaveWhere(name: "todo", details: "The Stand")
	}
	def findOrCreateWhere(){
		def task = Task.findOrSaveWhere(name: "todo", details: "The Stand")
	}
}	
