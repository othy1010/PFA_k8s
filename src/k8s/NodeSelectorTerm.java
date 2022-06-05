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
	 * Returns the value of the '<em><b>Match Expressions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Match Expressions</em>' attribute.
	 * @see #setMatchExpressions(EList)
	 * @see k8s.K8sPackage#getNodeSelectorTerm_MatchExpressions()
	 * @model many="false" transient="true"
	 * @generated
	 */
	EList<NodeSelectorRequirement> getMatchExpressions();

	/**
	 * Sets the value of the '{@link k8s.NodeSelectorTerm#getMatchExpressions <em>Match Expressions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Match Expressions</em>' attribute.
	 * @see #getMatchExpressions()
	 * @generated
	 */
	void setMatchExpressions(EList<NodeSelectorRequirement> value);

} // NodeSelectorTerm
