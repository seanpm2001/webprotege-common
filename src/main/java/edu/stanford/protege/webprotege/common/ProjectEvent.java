package edu.stanford.protege.webprotege.common;

import javax.annotation.Nonnull;

/**
 * Matthew Horridge
 * Stanford Center for Biomedical Informatics Research
 * 2021-08-29
 *
 * An {@link Event} that is specific to a Project.
 */
public interface ProjectEvent extends Event {

    @Nonnull
    ProjectId projectId();
}
