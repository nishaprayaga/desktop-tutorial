pipeline {
    agent any
    stages {
        stage('Test') {
            when { 
			changeRequest() 
			}
			steps
			{
        if (env.CHANGE_ID) {
            echo 'Something failed, send PR comment.';
            def comment = pullRequest.comment('Hello, something failed!');
                    } else {
            echo 'Nope, its not a PR!';
        }
    }
}
}
}
