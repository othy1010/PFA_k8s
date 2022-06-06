/**
 */
package k8s;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rolling Update Deployment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link k8s.RollingUpdateDeployment#getMaxUnavailable <em>Max Unavailable</em>}</li>
 *   <li>{@link k8s.RollingUpdateDeployment#getMaxSurge <em>Max Surge</em>}</li>
 * </ul>
 *
 * @see k8s.K8sPackage#getRollingUpdateDeployment()
 * @model
 * @generated
 */
public interface RollingUpdateDeployment extends EObject {
	/**
	 * Returns the value of the '<em><b>Max Unavailable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Unavailable</em>' attribute.
	 * @see #setMaxUnavailable(int)
	 * @see k8s.K8sPackage#getRollingUpdateDeployment_MaxUnavailable()
	 * @model required="true"
	 * @generated
	 */
	int getMaxUnavailable();

	/**
	 * Sets the value of the '{@link k8s.RollingUpdateDeployment#getMaxUnavailable <em>Max Unavailable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Unavailable</em>' attribute.
	 * @see #getMaxUnavailable()
	 * @generated
	 */
	void setMaxUnavailable(int value);

	/**
	 * Returns the value of the '<em><b>Max Surge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Surge</em>' attribute.
	 * @see #setMaxSurge(int)
	 * @see k8s.K8sPackage#getRollingUpdateDeployment_MaxSurge()
	 * @model required="true"
	 * @generated
	 */
	int getMaxSurge();

	/**
	 * Sets the value of the '{@link k8s.RollingUpdateDeployment#getMaxSurge <em>Max Surge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Surge</em>' attribute.
	 * @see #getMaxSurge()
	 * @generated
	 */
	void setMaxSurge(int value);

} // RollingUpdateDeployment
