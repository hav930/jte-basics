void call() {
node {
docker.image("gradle:latest").inside() {
	stage("Build"){
	sh 'gradle clean build'
	}
     }
}
}
