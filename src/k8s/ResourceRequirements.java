/**
 */
package k8s;

import java.util.Map;

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
	 * Returns the value of the '<em><b>Limits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Limits</em>' attribute.
	 * @see #setLimits(Map)
	 * @see k8s.K8sPackage#getResourceRequirements_Limits()
	 * @model transient="true"
	 * @generated
	 */
	Map<String, String> getLimits();

	/**
	 * Sets the value of the '{@link k8s.ResourceRequirements#getLimits <em>Limits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Limits</em>' attribute.
	 * @see #getLimits()
	 * @generated
	 */
	void setLimits(Map<String, String> value);

	/**
	 * Returns the value of the '<em><b>Requests</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requests</em>' attribute.
	 * @see #setRequests(Map)
	 * @see k8s.K8sPackage#getResourceRequirements_Requests()
	 * @model transient="true"
	 * @generated
	 */
	Map<String, String> getRequests();

	/**
	 * Sets the value of the '{@link k8s.ResourceRequirements#getRequests <em>Requests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requests</em>' attribute.
	 * @see #getRequests()
	 * @generated
	 */
	void setRequests(Map<String, String> value);

} // ResourceRequirements
