

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
		
			post
	package org.jenkinsci.plugins.pipeline.github;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import groovy.lang.GroovyObjectSupport;
import org.eclipse.egit.github.core.RepositoryId;
import org.jenkinsci.plugins.pipeline.github.client.ExtendedCommitComment;
import org.jenkinsci.plugins.pipeline.github.client.ExtendedCommitService;
import org.jenkinsci.plugins.scriptsecurity.sandbox.whitelists.Whitelisted;

import java.io.IOException;
import java.io.Serializable;
import java.io.UncheckedIOException;
import java.util.Date;
import java.util.Objects;

/**
 * Groovy wrapper over {@link ExtendedCommitComment}
 *
 * Additionally provides one the ability to update the comment body and delete the comment.
 *
 * @author Aaron Whiteside
 * @see ExtendedCommitComment
 */
@SuppressFBWarnings("SE_BAD_FIELD")
public class ReviewCommentGroovyObject extends GroovyObjectSupport implements Serializable {
    private static final long serialVersionUID = 1L;

    private String jobId;
    private final RepositoryId base;
    private ExtendedCommitComment commitComment;
    private transient ExtendedCommitService commitService;

    ReviewCommentGroovyObject(final String jobId,
                              final RepositoryId base,
                              final ExtendedCommitComment commitComment,
                              final ExtendedCommitService commitService) {
        this.jobId = Objects.requireNonNull(jobId, "jobId cannot be null");
        this.base = Objects.requireNonNull(base, "base cannot be null");
        this.commitComment = Objects.requireNonNull(commitComment, "commitComment cannot be null");
        this.commitService = Objects.requireNonNull(commitService, "commitService cannot be null");
    }

    private ExtendedCommitService getCommitService() {
        if (commitService == null) {
            commitService = new ExtendedCommitService(GitHubHelper.getGitHubClient(GitHubHelper.getJob(jobId)));
        }
        return commitService;
    }

    @Whitelisted
    @Deprecated
    public Integer getLine() {
        return commitComment.getLine();
    }

    @Whitelisted
    public Integer getPosition() {
        return commitComment.getPosition();
    }

    @Whitelisted
    public Integer getOriginalPosition() {
        return commitComment.getOriginalPosition();
    }

    @Whitelisted
    public String getCommitId() {
        return commitComment.getCommitId();
    }

    @Whitelisted
    public String getOriginalCommitId() {
        return commitComment.getOriginalCommitId();
    }

    @Whitelisted
    public String getPath() {
        return commitComment.getPath();
    }

    @Whitelisted
    public String getDiffHunk() {
        return commitComment.getDiffHunk();
    }

    @Whitelisted
    public Date getCreatedAt() {
        return commitComment.getCreatedAt();
    }

    @Whitelisted
    public Date getUpdatedAt() {
        return commitComment.getUpdatedAt();
    }

    @Whitelisted
    public String getBody() {
        return commitComment.getBody();
    }

    @Whitelisted
    public long getId() {
        return commitComment.getId();
    }

    @Whitelisted
    public String getUrl() {
        return commitComment.getUrl();
    }

    @Whitelisted
    public String getUser() {
        return GitHubHelper.userToLogin(commitComment.getUser());
    }

    @Whitelisted
    public long getInReplyToId() {
        return commitComment.getInReplyToId();
    }

    @Whitelisted
    public String getPullRequestUrl() {
        return commitComment.getPullRequestUrl();
    }

    @Whitelisted
    public long getPullRequestReviewId() {
        return commitComment.getPullRequestReviewId();
    }

    @Whitelisted
    public void setBody(final String body) {
        Objects.requireNonNull(body, "body cannot be null");

        ExtendedCommitComment edit = new ExtendedCommitComment();
        edit.setId(commitComment.getId());
        edit.setBody(body);
        try {
            commitComment = getCommitService().editComment2(base, edit);
        } catch (final IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    @Whitelisted
    public void delete() {
        try {
            getCommitService().deleteComment(base, commitComment.getId());
        } catch (final IOException e) {
            throw new UncheckedIOException(e);
        }
    }

//    @Whitelisted
    public void replyTo(final String body) {
        Objects.requireNonNull(body, "body is a required argument");
        try {
            getCommitService().replyToComment(base, commitComment.getCommitId(), (int) commitComment.getId(), body);
        } catch (final IOException e) {
            throw new UncheckedIOException(e);
        }
    }
}
	}
    
		
	}
