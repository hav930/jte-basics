	node {
	stage("Gradle: Build"){
	sh 'gradle clean build'
	}
}

