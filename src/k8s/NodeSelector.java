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
	 * Returns the value of the '<em><b>Node Selector Terms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Selector Terms</em>' attribute.
	 * @see #setNodeSelectorTerms(EList)
	 * @see k8s.K8sPackage#getNodeSelector_NodeSelectorTerms()
	 * @model many="false" transient="true"
	 * @generated
	 */
	EList<NodeSelectorTerm> getNodeSelectorTerms();

	/**
	 * Sets the value of the '{@link k8s.NodeSelector#getNodeSelectorTerms <em>Node Selector Terms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Selector Terms</em>' attribute.
	 * @see #getNodeSelectorTerms()
	 * @generated
	 */
	void setNodeSelectorTerms(EList<NodeSelectorTerm> value);

} // NodeSelector
