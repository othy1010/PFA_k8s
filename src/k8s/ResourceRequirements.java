/**
 */
package k8s;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Requirements</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link k8s.ResourceRequirements#getLimits <em>Limits</em>}</li>
 *   <li>{@link k8s.ResourceRequirements#getRequests <em>Requests</em>}</li>
 * </ul>
 *
 * @see k8s.K8sPackage#getResourceRequirements()
 * @model
 * @generated
 */
public interface ResourceRequirements extends EObject {
	/**
	 * Returns the value of the '<em><b>Limits</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Limits</em>' containment reference.
	 * @see #setLimits(Mymap)
	 * @see k8s.K8sPackage#getResourceRequirements_Limits()
	 * @model containment="true"
	 * @generated
	 */
	Mymap getLimits();

	/**
	 * Sets the value of the '{@link k8s.ResourceRequirements#getLimits <em>Limits</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Limits</em>' containment reference.
	 * @see #getLimits()
	 * @generated
	 */
	void setLimits(Mymap value);

	/**
	 * Returns the value of the '<em><b>Requests</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requests</em>' containment reference.
	 * @see #setRequests(Mymap)
	 * @see k8s.K8sPackage#getResourceRequirements_Requests()
	 * @model containment="true"
	 * @generated
	 */
	Mymap getRequests();

	/**
	 * Sets the value of the '{@link k8s.ResourceRequirements#getRequests <em>Requests</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requests</em>' containment reference.
	 * @see #getRequests()
	 * @generated
	 */
	void setRequests(Mymap value);

} // ResourceRequirements
