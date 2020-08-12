

pipeline{
   agent any
    stages {
	     stage ('.....clean'){
		    steps{
			    echo "hello"
				}
			}
			stage('...test..'){
			steps{
			echo "hello"
			}
			}
			stage('...run deploy..'){
			 steps{
			echo "done"
			 }
			 }
	    
	       }
		
			post {
		success {
			githubPRComment comment: githubPRMessage("all done"), statusVerifier: allowRunOnStatus("SUCCESS"), errorHandler: statusOnPublisherError("UNSTABLE")
		}
	}
    
		
	}
