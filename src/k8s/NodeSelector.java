/**
 */
package k8s;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Selector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link k8s.NodeSelector#getNodeSelectorTerms <em>Node Selector Terms</em>}</li>
 * </ul>
 *
 * @see k8s.K8sPackage#getNodeSelector()
 * @model
 * @generated
 */
public interface NodeSelector extends EObject {
	/**
	 * Returns the value of the '<em><b>Node Selector Terms</b></em>' containment reference list.
	 * The list contents are of type {@link k8s.NodeSelectorTerm}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Selector Terms</em>' containment reference list.
	 * @see k8s.K8sPackage#getNodeSelector_NodeSelectorTerms()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<NodeSelectorTerm> getNodeSelectorTerms();

} // NodeSelector
