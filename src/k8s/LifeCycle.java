/**
 */
package k8s;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Life Cycle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link k8s.LifeCycle#getPostStart <em>Post Start</em>}</li>
 *   <li>{@link k8s.LifeCycle#getPreStop <em>Pre Stop</em>}</li>
 * </ul>
 *
 * @see k8s.K8sPackage#getLifeCycle()
 * @model
 * @generated
 */
public interface LifeCycle extends EObject {
	/**
	 * Returns the value of the '<em><b>Post Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post Start</em>' containment reference.
	 * @see #setPostStart(Handler)
	 * @see k8s.K8sPackage#getLifeCycle_PostStart()
	 * @model containment="true"
	 * @generated
	 */
	Handler getPostStart();

	/**
	 * Sets the value of the '{@link k8s.LifeCycle#getPostStart <em>Post Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post Start</em>' containment reference.
	 * @see #getPostStart()
	 * @generated
	 */
	void setPostStart(Handler value);

	/**
	 * Returns the value of the '<em><b>Pre Stop</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre Stop</em>' containment reference.
	 * @see #setPreStop(Handler)
	 * @see k8s.K8sPackage#getLifeCycle_PreStop()
	 * @model containment="true"
	 * @generated
	 */
	Handler getPreStop();

	/**
	 * Sets the value of the '{@link k8s.LifeCycle#getPreStop <em>Pre Stop</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre Stop</em>' containment reference.
	 * @see #getPreStop()
	 * @generated
	 */
	void setPreStop(Handler value);

} // LifeCycle
