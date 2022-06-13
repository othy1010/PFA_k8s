/**
 */
package k8s;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Manifest</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link k8s.Manifest#getApiVersion <em>Api Version</em>}</li>
 *   <li>{@link k8s.Manifest#getKind <em>Kind</em>}</li>
 *   <li>{@link k8s.Manifest#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link k8s.Manifest#getSpec <em>Spec</em>}</li>
 * </ul>
 *
 * @see k8s.K8sPackage#getManifest()
 * @model
 * @generated
 */
public interface Manifest extends EObject {
	/**
	 * Returns the value of the '<em><b>Api Version</b></em>' attribute.
	 * The literals are from the enumeration {@link k8s.ApiVersion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api Version</em>' attribute.
	 * @see k8s.ApiVersion
	 * @see #setApiVersion(ApiVersion)
	 * @see k8s.K8sPackage#getManifest_ApiVersion()
	 * @model required="true"
	 * @generated
	 */
	ApiVersion getApiVersion();

	/**
	 * Sets the value of the '{@link k8s.Manifest#getApiVersion <em>Api Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Version</em>' attribute.
	 * @see k8s.ApiVersion
	 * @see #getApiVersion()
	 * @generated
	 */
	void setApiVersion(ApiVersion value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link k8s.Kind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see k8s.Kind
	 * @see #setKind(Kind)
	 * @see k8s.K8sPackage#getManifest_Kind()
	 * @model required="true"
	 * @generated
	 */
	Kind getKind();

	/**
	 * Sets the value of the '{@link k8s.Manifest#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see k8s.Kind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(Kind value);

	/**
	 * Returns the value of the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metadata</em>' containment reference.
	 * @see #setMetadata(Metadata)
	 * @see k8s.K8sPackage#getManifest_Metadata()
	 * @model containment="true"
	 * @generated
	 */
	Metadata getMetadata();

	/**
	 * Sets the value of the '{@link k8s.Manifest#getMetadata <em>Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metadata</em>' containment reference.
	 * @see #getMetadata()
	 * @generated
	 */
	void setMetadata(Metadata value);

	/**
	 * Returns the value of the '<em><b>Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spec</em>' containment reference.
	 * @see #setSpec(Spec)
	 * @see k8s.K8sPackage#getManifest_Spec()
	 * @model containment="true"
	 * @generated
	 */
	Spec getSpec();

	/**
	 * Sets the value of the '{@link k8s.Manifest#getSpec <em>Spec</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spec</em>' containment reference.
	 * @see #getSpec()
	 * @generated
	 */
	void setSpec(Spec value);

} // Manifest
