/**
 */
package k8s;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Selector Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link k8s.NodeSelectorTerm#getMatchExpressions <em>Match Expressions</em>}</li>
 * </ul>
 *
 * @see k8s.K8sPackage#getNodeSelectorTerm()
 * @model
 * @generated
 */
public interface NodeSelectorTerm extends EObject {
	/**
	 * Returns the value of the '<em><b>Match Expressions</b></em>' reference list.
	 * The list contents are of type {@link k8s.NodeSelectorRequirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Match Expressions</em>' reference list.
	 * @see k8s.K8sPackage#getNodeSelectorTerm_MatchExpressions()
	 * @model required="true"
	 * @generated
	 */
	EList<NodeSelectorRequirement> getMatchExpressions();

} // NodeSelectorTerm
