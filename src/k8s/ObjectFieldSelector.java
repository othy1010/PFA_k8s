/**
 */
package k8s;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Field Selector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link k8s.ObjectFieldSelector#getApiVersion <em>Api Version</em>}</li>
 *   <li>{@link k8s.ObjectFieldSelector#getFieldPath <em>Field Path</em>}</li>
 * </ul>
 *
 * @see k8s.K8sPackage#getObjectFieldSelector()
 * @model
 * @generated
 */
public interface ObjectFieldSelector extends EObject {
	/**
	 * Returns the value of the '<em><b>Api Version</b></em>' attribute.
	 * The literals are from the enumeration {@link k8s.ApiVersion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api Version</em>' attribute.
	 * @see k8s.ApiVersion
	 * @see #setApiVersion(ApiVersion)
	 * @see k8s.K8sPackage#getObjectFieldSelector_ApiVersion()
	 * @model
	 * @generated
	 */
	ApiVersion getApiVersion();

	/**
	 * Sets the value of the '{@link k8s.ObjectFieldSelector#getApiVersion <em>Api Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Version</em>' attribute.
	 * @see k8s.ApiVersion
	 * @see #getApiVersion()
	 * @generated
	 */
	void setApiVersion(ApiVersion value);

	/**
	 * Returns the value of the '<em><b>Field Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Path</em>' attribute.
	 * @see #setFieldPath(String)
	 * @see k8s.K8sPackage#getObjectFieldSelector_FieldPath()
	 * @model
	 * @generated
	 */
	String getFieldPath();

	/**
	 * Sets the value of the '{@link k8s.ObjectFieldSelector#getFieldPath <em>Field Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Path</em>' attribute.
	 * @see #getFieldPath()
	 * @generated
	 */
	void setFieldPath(String value);

} // ObjectFieldSelector
