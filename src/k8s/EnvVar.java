/**
 */
package k8s;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Env Var</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link k8s.EnvVar#getName <em>Name</em>}</li>
 *   <li>{@link k8s.EnvVar#getValue <em>Value</em>}</li>
 *   <li>{@link k8s.EnvVar#getValueFrom <em>Value From</em>}</li>
 * </ul>
 *
 * @see k8s.K8sPackage#getEnvVar()
 * @model
 * @generated
 */
public interface EnvVar extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see k8s.K8sPackage#getEnvVar_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link k8s.EnvVar#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see k8s.K8sPackage#getEnvVar_Value()
	 * @model required="true"
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link k8s.EnvVar#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

	/**
	 * Returns the value of the '<em><b>Value From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value From</em>' reference.
	 * @see #setValueFrom(EnvVarSource)
	 * @see k8s.K8sPackage#getEnvVar_ValueFrom()
	 * @model required="true"
	 * @generated
	 */
	EnvVarSource getValueFrom();

	/**
	 * Sets the value of the '{@link k8s.EnvVar#getValueFrom <em>Value From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value From</em>' reference.
	 * @see #getValueFrom()
	 * @generated
	 */
	void setValueFrom(EnvVarSource value);

} // EnvVar
