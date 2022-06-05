/**
 */
package k8s;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Probe</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link k8s.Probe#getHttpGet <em>Http Get</em>}</li>
 *   <li>{@link k8s.Probe#getExec <em>Exec</em>}</li>
 *   <li>{@link k8s.Probe#getInitialDelaySeconds <em>Initial Delay Seconds</em>}</li>
 *   <li>{@link k8s.Probe#getTimeoutSeconds <em>Timeout Seconds</em>}</li>
 * </ul>
 *
 * @see k8s.K8sPackage#getProbe()
 * @model
 * @generated
 */
public interface Probe extends EObject {
	/**
	 * Returns the value of the '<em><b>Http Get</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Http Get</em>' reference.
	 * @see #setHttpGet(HTTPGetAction)
	 * @see k8s.K8sPackage#getProbe_HttpGet()
	 * @model required="true" transient="true"
	 * @generated
	 */
	HTTPGetAction getHttpGet();

	/**
	 * Sets the value of the '{@link k8s.Probe#getHttpGet <em>Http Get</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Http Get</em>' reference.
	 * @see #getHttpGet()
	 * @generated
	 */
	void setHttpGet(HTTPGetAction value);

	/**
	 * Returns the value of the '<em><b>Exec</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exec</em>' reference.
	 * @see #setExec(ExecAction)
	 * @see k8s.K8sPackage#getProbe_Exec()
	 * @model required="true" transient="true"
	 * @generated
	 */
	ExecAction getExec();

	/**
	 * Sets the value of the '{@link k8s.Probe#getExec <em>Exec</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exec</em>' reference.
	 * @see #getExec()
	 * @generated
	 */
	void setExec(ExecAction value);

	/**
	 * Returns the value of the '<em><b>Initial Delay Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Delay Seconds</em>' attribute.
	 * @see #setInitialDelaySeconds(int)
	 * @see k8s.K8sPackage#getProbe_InitialDelaySeconds()
	 * @model
	 * @generated
	 */
	int getInitialDelaySeconds();

	/**
	 * Sets the value of the '{@link k8s.Probe#getInitialDelaySeconds <em>Initial Delay Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Delay Seconds</em>' attribute.
	 * @see #getInitialDelaySeconds()
	 * @generated
	 */
	void setInitialDelaySeconds(int value);

	/**
	 * Returns the value of the '<em><b>Timeout Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timeout Seconds</em>' attribute.
	 * @see #setTimeoutSeconds(int)
	 * @see k8s.K8sPackage#getProbe_TimeoutSeconds()
	 * @model
	 * @generated
	 */
	int getTimeoutSeconds();

	/**
	 * Sets the value of the '{@link k8s.Probe#getTimeoutSeconds <em>Timeout Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timeout Seconds</em>' attribute.
	 * @see #getTimeoutSeconds()
	 * @generated
	 */
	void setTimeoutSeconds(int value);

} // Probe
