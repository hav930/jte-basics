void call(){
	stage("Gradle: Build"){
	sh 'gradle clean build'
	println "Built gradle"
}
}
