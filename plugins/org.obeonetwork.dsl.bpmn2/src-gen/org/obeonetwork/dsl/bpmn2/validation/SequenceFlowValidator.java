/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.bpmn2.validation;

import org.obeonetwork.dsl.bpmn2.Expression;
import org.obeonetwork.dsl.bpmn2.FlowNode;

/**
 * A sample validator interface for {@link org.obeonetwork.dsl.bpmn2.SequenceFlow}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface SequenceFlowValidator {
	boolean validate();

	boolean validateIsImmediate(boolean value);

	boolean validateConditionExpression(Expression value);

	boolean validateTargetRef(FlowNode value);

	boolean validateSourceRef(FlowNode value);
}
