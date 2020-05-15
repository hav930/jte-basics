void call(){
	stage("Gradle: Build"){
	gradle clean build
	println "Built gradle"
}
}
