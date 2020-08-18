pipeline {
    agent any
    stages {
        stage('Test') {
            when { 
			changeRequest() 
			}
			steps
			{
        
            echo 'Something failed, send PR comment.';
            def comment = pullRequest.comment('Hello, something failed!');
                   
        }
    }
}
}

