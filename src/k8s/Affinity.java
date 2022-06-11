/**
 */
package k8s;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Affinity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link k8s.Affinity#getNodeAffinity <em>Node Affinity</em>}</li>
 * </ul>
 *
 * @see k8s.K8sPackage#getAffinity()
 * @model
 * @generated
 */
public interface Affinity extends EObject {
	/**
	 * Returns the value of the '<em><b>Node Affinity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Affinity</em>' containment reference.
	 * @see #setNodeAffinity(NodeAffinity)
	 * @see k8s.K8sPackage#getAffinity_NodeAffinity()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NodeAffinity getNodeAffinity();

	/**
	 * Sets the value of the '{@link k8s.Affinity#getNodeAffinity <em>Node Affinity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Affinity</em>' containment reference.
	 * @see #getNodeAffinity()
	 * @generated
	 */
	void setNodeAffinity(NodeAffinity value);

} // Affinity
