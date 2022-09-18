pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        sh 'mvn clean install'
        sh 'echo "Hello Jenkins"'
                sh '''
                    echo "Multiline shell steps works as well"
                    ls -lah
                '''
      }
    }

  }
}
