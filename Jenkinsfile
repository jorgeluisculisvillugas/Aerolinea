
pipeline {
    agent any
    stages {
        stage('Clonar Repositorio') {
            steps {
                git branch: 'main', url: "https://github.com/jorgeluisculisvillugas/Aerolinea.git"
            }
        }
        stage('Compilar y Construir') {
            steps {
                bat './mvnw.cmd clean package'
            }
        }
        stage('Ejecutar Aplicación') {
            steps {
                bat 'java -jar target/ConsultaVuelos-0.0.1-SNAPSHOT.jar --server.port=8081'
            }
        }
    }
}

