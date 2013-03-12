/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpmn2.validation;

import org.eclipse.bpmn2.ChoreographyLoopType;
import org.eclipse.bpmn2.CorrelationKey;
import org.eclipse.bpmn2.Participant;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link org.eclipse.bpmn2.ChoreographyActivity}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ChoreographyActivityValidator {
    boolean validate();

    boolean validateParticipantRefs(EList<Participant> value);

    boolean validateInitiatingParticipantRef(Participant value);

    boolean validateCorrelationKeys(EList<CorrelationKey> value);

    boolean validateLoopType(ChoreographyLoopType value);
}