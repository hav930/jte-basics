void call(){
	node {
	stage("Gradle: Build"){
	gradle clean build
	println "Built gradle"
	}
}
}
