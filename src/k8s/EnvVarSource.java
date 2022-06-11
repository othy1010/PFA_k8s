/**
 */
package k8s;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Env Var Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link k8s.EnvVarSource#getFieldRef <em>Field Ref</em>}</li>
 *   <li>{@link k8s.EnvVarSource#getSecretKeyRef <em>Secret Key Ref</em>}</li>
 * </ul>
 *
 * @see k8s.K8sPackage#getEnvVarSource()
 * @model
 * @generated
 */
public interface EnvVarSource extends EObject {
	/**
	 * Returns the value of the '<em><b>Field Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Ref</em>' containment reference.
	 * @see #setFieldRef(SecretKeySelector)
	 * @see k8s.K8sPackage#getEnvVarSource_FieldRef()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SecretKeySelector getFieldRef();

	/**
	 * Sets the value of the '{@link k8s.EnvVarSource#getFieldRef <em>Field Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Ref</em>' containment reference.
	 * @see #getFieldRef()
	 * @generated
	 */
	void setFieldRef(SecretKeySelector value);

	/**
	 * Returns the value of the '<em><b>Secret Key Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secret Key Ref</em>' containment reference.
	 * @see #setSecretKeyRef(ObjectFieldSelector)
	 * @see k8s.K8sPackage#getEnvVarSource_SecretKeyRef()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ObjectFieldSelector getSecretKeyRef();

	/**
	 * Sets the value of the '{@link k8s.EnvVarSource#getSecretKeyRef <em>Secret Key Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secret Key Ref</em>' containment reference.
	 * @see #getSecretKeyRef()
	 * @generated
	 */
	void setSecretKeyRef(ObjectFieldSelector value);

} // EnvVarSource
